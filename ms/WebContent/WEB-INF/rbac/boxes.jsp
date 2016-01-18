<!-- Confirm -->
<div class="modal fade" id="confirmModal" tabindex="-1" role="dialog"
	aria-labelledby="confirmTitleText" aria-hidden="true" data-backdrop="static" 
	style="width:40%;margin-left:30%;margin-top:10%;">
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">×</button>
			<h4 class="modal-title" id="confirmTitleText">Confirm Title</h4>
		</div>
		<div class="modal-body text-center">
			<div id="confirmMsgText" class="alert alert-warning">Confirm Message</div>
		</div>
		<div class="modal-footer">
			<button id="confirmBoxCancel" type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
			<button id="confirmBoxConfirm" type="button" class="btn btn-primary" data-dismiss="modal">Confirm</button>
		</div>
	</div>
</div>



<!-- Waiting -->
<div id="waitModal" class="modal fix-min-modal-win fade" tabindex="-1"
	data-width="600" data-backdrop="static" data-keyboard="false">
	<div class="modal-body ">
		<div class="row">
			<div class="text-center">
				Waiting <img src="${pageContext.request.contextPath}/webresource/images/loading.gif">
			</div>
		</div>
	</div>
</div>


<!-- Status -->
<div class="modal fade" id="statusModal" tabindex="-1" role="dialog"
	aria-labelledby="statusModalLabel" aria-hidden="true" data-width="720" data-backdrop="static">
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">×</button>
			<h4 class="modal-title" id="statusModalLabel">Status</h4>
		</div>
		<div class="modal-body text-center">
			<div id="alert" class="alert alert-success">Tenant Saved
				Successfully</div>
		</div>
		<div class="modal-footer">
			<button type="button" class="btn btn-default" data-dismiss="modal">OK
			</button>
		</div>
	</div>
</div>

<!-- View -->
<div class="modal fade" id="viewBox" tabindex="-1" role="dialog"
	aria-labelledby="statusModalLabel" data-width="85%" aria-hidden="true">
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal"
				aria-hidden="true">×</button>

			<h4 class="modal-title" id="editModalLabel">
				<i class="glyphicon glyphicon-eye-open"></i> &nbsp;&nbsp;View Box
			</h4>
		</div>
		<div class="modal-body">
			<!--  
				<a id="fullScreen" class="btn btn-sm btn-default"> <i
					class="glyphicon glyphicon-resize-full"></i>
				</a> <a id="fullScreen" class="btn btn-sm btn-default"> <i
					class="glyphicon glyphicon-resize-small"></i>
				</a>
				<hr>
			 -->
			<pre id="viewAlert" class="pre-scrollable">
				<div contentEditable></div>
			</pre>
		</div>
		<div class="modal-footer">
			<button id="editXML" class="btn btn-primary">
				<i class="glyphicon glyphicon-pencil"></i> Modify
			</button>
		</div>
	</div>
</div>