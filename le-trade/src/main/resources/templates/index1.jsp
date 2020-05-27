<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
订单号：<input id="orderNo"/>
商品描述：<input id="body"/>
商品金额：<input id="money"/>
<input type="button" value="支付" id="pay"/>

<div id="code">

</div>

<script type="text/javascript" src="static/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="static/js/qrcode.js"></script>
<script type="text/javascript">
	$("#pay").click(function(){
		var orderNo = $("#orderNo").val();
		var body = $("#body").val();
		var money = $("#money").val();
		$.ajax({
			url:"weixin/pay",
			data:{"orderNo":orderNo,"body":body,"money":money},
			type:"POST",
			success:function(data){
				//参数1表示图像大小，取值范围1-10；参数2表示质量，取值范围'L','M','Q','H'
				var qr = qrcode(10, 'H');
				qr.addData(data);
				qr.make();
				$("#code").html(qr.createImgTag());
				setInterval(query,5000);
			}

		});
	});

	function query(){
		$.ajax({
			url:"query",
			type:"POST",
			dataType:"json",
			success:function(data){
				console.log(data);
				if(data==true){
					location.href="http://localhost:8082/pay/success";
				}
			},
			error:function(e){
				console.log(e);
			}
		});
	}
</script>

</body>
</html>
