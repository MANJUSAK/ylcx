$(function() {
	get_data()

	function get_data() {
		$.ajax({
			type: "post",
			url: "http://172.16.13.113/Garden/projectManage/querySupervisionlogMsg",
			async: true,
			data: {
				uid: $.session.get('uid')
			},
			success: function(result) {
				console.log(result.data)
				var html = '';
				var html_ = '';
				var data = result.data;
				var pid = $.session.get('pid');
				if(result.status == 0 && result.data != null) {
					$.each(data, function(n) {
						if(data[n].pid == pid) {
							html += '<ul>' +
								'<li>' + data[n].projectName + '</li>' +
								'<li>' + data[n].dates + '</li>' +
								'<li>' + data[n].noteTaker + '</li>' +
								'<li>' + data[n].progressSituation + '</li>' +
								'</ul>';
							html_ += '<ul>' +
								'<li>' + data[n].engineer + '</li>' +
								'<li>' + data[n].supervisionPosition + '</li>' +
								'<li>' + data[n].workingSitustion + '</li>' +
								'<li>' + data[n].question + '</li>' +
								'<li>' + data[n].other + '</li>' +
								'</ul>';

						}
					});
				} else {
					html = '暂无项目或未选择项目';
					html_ = '';
				}
				$('#one').html(html);
				$('#two').html(html_);
			},
			error: function(e) {
				alert(e)
			}
		});
	}
	//表单赋值
	$('#uid').val($.session.get('uid'));
	$('#pid').val($.session.get('pid'));

	/*************阻止无项目人员查看其他信息****************/
	$('.iisc-left-content ul li').click(function() {
		if($(this).index() !== 0) {
			if(!$.session.get('pid')) {
				alert('未选择项目或者你还没有建立项目');
				event.preventDefault();
			}
		}
	})
})