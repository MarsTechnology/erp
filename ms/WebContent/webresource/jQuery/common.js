function showStatus(msg, sClass) {	
	$("#statusModal").modal('show');
	var flag = true;
	if (sClass) {
		$("#alert").removeClass("alert-success");
		$("#alert").addClass("alert-danger");
	} else {
		if ($("#alert").hasClass("alert-danger")) {
			$("#alert").removeClass("alert-danger");
			$("#alert").addClass("alert-success");
		}
		flag = false;
	}

	if (msg)
		$("#alert").html(msg).hide().fadeIn();
	else
		$("#alert").hide().fadeIn();
	
	return flag;
}

/**
 * 
 * @param titleText
 * @param msgText
 * @param cancelBtnText
 * @param confirmBtnText
 * @returns {Boolean}
 * 
 * Usage:
 * showConfirmBox(
 * 			'Waning',
 * 			'Do you want to go ahead?',
 * 			'Cancel',
 * 			'Confirm',
 * 			function(){
 * 				//this end function will trigger after clicking the confirm button
 * 				console.log('Running ending function');
 * 			}
 */

function showConfirmBox(titleText, msgText, cancelBtnText, confirmBtnText, fnEnd){
	$('#confirmModal').modal("show");
	$("#confirmTitleText").text(titleText);
	$("#confirmMsgText").text(msgText);
	
	if(cancelBtnText){
		if(cancelBtnText == "hideCancle"){
			$("#confirmBoxCancel").hide();
		}else{
			$("#confirmBoxCancel").show();
		}
		$("#confirmBoxCancel").text(cancelBtnText);
		
	}
	if(confirmBtnText)$("#confirmBoxConfirm").text(confirmBtnText);
	
	var first = true;
	$("#confirmBoxCancel").on('click',function(){
		$("#confirmModal").modal("hide");
		if(fnEnd){
			fnEnd = null;
			first = true;
		}
	});
	$("#confirmBoxConfirm").on('click',function(){
		$("#confirmModal").modal("hide");
		if(first && fnEnd){
			fnEnd();first = false;
		}
	});
}