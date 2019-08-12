$(function() {
	$("#checkId").click(function() {
		var id = $("#id").val();
		$.ajax({
			url: "selectId",
			data : {"id":id},
			success : function(result) {
				if(result.trim()=="중복됨"){
					alert("중복됐어요!!")
				}else{
					alert("사용가능!!")
					$("#sign").prop("disabled",false)
				}
			}
		})
	})
})