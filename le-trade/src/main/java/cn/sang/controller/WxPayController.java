package cn.sang.controller;


import cn.sang.config.WxPayUtil;
import cn.sang.config.WxRequestParam;
import cn.sang.dao2.OrderInfoDao;
import cn.sang.entity.OrderInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
//@Api("微信支付模块")
//@RequestMapping("/wexin/")
public class WxPayController {

    @Resource
    private OrderInfoDao orderInfoDao;

    /**
     * 从页面获取参数
     *  @param orderNo 订单号
     * @param body 描述
     * @param money 金额
     * @param session
     * @return
     */
//    @ApiIgnore
    @RequestMapping(value = "/weixin/pay",method = RequestMethod.POST)
    @ResponseBody
    public String pay(String orderNo,String body, String money, HttpSession session) {
        System.out.println("第一个方法----------------"+orderNo);
        WxRequestParam param = new WxRequestParam();

        param.setBody(body);
        param.setTotal_fee(money);
        param.setOut_trade_no(String.valueOf(System.currentTimeMillis()));

        session.setAttribute("tradeNo", param.getOut_trade_no());   //保存交易号
        session.setAttribute("orderNo",orderNo);                    //保存订单号
        System.out.println("第一个方法tradeNo值："+param.getOut_trade_no());
        String codeUrl= WxPayUtil.getCodeUrl(param);
        return codeUrl;
    }

    /**
     * 验证支付方法
     * @param session
     * @return
     */
    @RequestMapping(value = "query",method = RequestMethod.POST)
    @ResponseBody
    public Object queryOrderState(HttpSession session) {
        System.out.println("第二个方法----------------");
        String orderId=(String) session.getAttribute("tradeNo");
        System.out.println("交易号："+orderId);
        WxRequestParam param = new WxRequestParam();
        param.setOut_trade_no(orderId);
        boolean result=WxPayUtil.queryOrderState(param);    //支付成功返回true
        return result;
    }

    @RequestMapping(value = "index",method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index1");
        System.out.println("index方法----------------");
        return mv;
    }

    /**
     * 支付成功调用
     * @return
     */
    @RequestMapping(value = "/success",method = RequestMethod.GET)
    public ModelAndView success(HttpSession session) throws Exception {
        System.out.println("success方法----------------");

        String orderNo=(String) session.getAttribute("orderNo");
        String tradeNo=(String)session.getAttribute("tradeNo");
        System.out.println(orderNo);
        System.out.println(tradeNo);
        OrderInfo order = new OrderInfo();
        order.setOrderNo(Long.valueOf(orderNo));//订单号
        List<OrderInfo> orderList = orderInfoDao.queryAll(order);
        order.setOrderStatus(2);
        order.setPayTime(new Date());
        order.setPayType(1);
        order.setId(orderList.get(0).getId());
        orderInfoDao.update(order);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("success");
        return mv;
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "notice")
    public ModelAndView notice() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("notice");
        return mv;
    }
}
