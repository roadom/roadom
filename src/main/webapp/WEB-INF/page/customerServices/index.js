var chat = {
	chatBoard : $("#chatBoard"),
	myInput : $("#myInput"),
	submit : $("#submit"),
	init : function(){
		chatBoard = $("#chatBoard");
		myInput = $("#myInput");
		submit = $("#submit");
		
		submit.click(function(){
			var thisVal = myInput.val();
			chatBoard.append("I said: <br/>&nbsp;&nbsp;"+thisVal+"<br/>");
			myInput.val("");
			chat.post(thisVal);
		});
		
	},
	post : function(inputVal){
//		$.get("http://www.tuling123.com/openapi/api", {
//			key : "71b23459ed098811b6f4840d65e7c5ce", 
//			info : inputVal,
//			userid : 1127971
//		}, function(result){
//			alert(result);
//		});
		
		
		$.ajax({
			url : "http://www.tuling123.com/openapi/api", 
			data : {
				key : "71b23459ed098811b6f4840d65e7c5ce", 
				info : inputVal,
				userid : 1127971
			},
			type : "get",
			jsonp: "callback",
			dataType : "jsonp",
			cache : false,
			async : false,
			success : function(result){
				alert(result);
			}
		});
		
		
		
		
		$("#postIframe").attr("src", "http://www.tuling123.com/openapi/api?key=71b23459ed098811b6f4840d65e7c5ce&info="+inputVal);
		window.frames['postIframe'].document.onload = function(){
			alert(123);
//			setTimeout(function(){
//				alert($("body", window.frames['postIframe'].document).html());
//			}, 1000);
		};
		
	}, 
	printResult : function(){
	}

};


$(function(){
	chat.init();
});