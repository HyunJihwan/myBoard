<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>

<style>
.content-wrapper {
	background-color: #fff;
}
</style>
<section class="content-header">
	<div class="container-fluid">
		<div class="row md-2">
			<div class="col-sm-6">
				<h1>${param.subject }</h1>
			</div>
			<div class="col-sm-6">
				<ol class="breadcrumb float-sm-right">
					<li class="breadcrumb-item">
						<a href="#">
							<i class="fa fa-dashboard"></i>${param.subject }
						</a>
					</li>
					<li class="breadcrumb-item active">
						${param.item }
					</li>
				</ol>
			</div>
		</div>
	</div>	
</section>