<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<%-- <jsp:useBean id="pagedListHolder" scope="request"
							type="org.springframework.beans.support.PagedListHolder" />
						<c:url value="/statistics_kcp" var="pagedLink">
							<c:param name="p" value="~" />
						</c:url>

						<tg:paging pagedLink="${pageLink}"
							pagedListHolder="${pagedListHolder}" /> --%>
	<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h2 class="card-title">
						<i class="nav-icon far fa-calendar-alt"></i> HISTORIQUES
					</h2>
				</div>
			</div>
			<br />
			<form role="form">
				<div class="row">
					<div class="col-sm-3">
						<!-- text input -->
						<div class="form-group">
							<label>NOM LOT</label> <input type="text" class="form-control"
								placeholder="Ex: DRH_Capture_1_DRH_sysadmin_07042020">
						</div>
					</div>
					<div class="col-sm-3">
						<!-- text input -->
						<div class="form-group">
							<label>AUTEUR NUMERISATION</label> <input type="text"
								class="form-control" placeholder="Ex: Laurent Kerey">
						</div>
					</div>
					<div class="col-sm-3">
						<!-- text input -->
						<div class="form-group">
							<label>BASE DOCUMENTAIRE</label> <input type="text"
								class="form-control" placeholder="Ex: DRH">
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-sm-3">
						<label>DATE NUMERISATION:</label>

						<div class="input-group">
							<div class="input-group-prepend">
								<span class="input-group-text"> <i
									class="far fa-calendar-alt"></i>
								</span>
							</div>
							<input type="text" class="form-control float-right"
								id="reservation">
						</div>
						<!-- /.input group -->
					</div>
					<div class="col-sm-3">
						<!-- text input -->
						<div class="form-group">
							<label>FILE NAME</label> <input type="text" class="form-control"
								placeholder="Ex: File07032020">
						</div>
					</div>
					<div class="col-sm-3">
						<!-- text input -->
						<div class="form-group">
							<label>STATUT</label> <input type="text" class="form-control"
								placeholder="Ex: Traité">
						</div>
					</div>
				</div>
			</form>
			<!-- /.row -->
			<br /> <br />
			<section class="content">
				<div class="container-fluid">
					<div class="row">
						<div class="col-sm-3">
							<button type="button" class="btn btn-block btn-success btn-flatx">Export
								CSV</button>
						</div>
					</div>
				</div>
			</section>
			<br />
		</div>

		<div class="row">
			<div class="col-12">
				<div class="card">
					<!-- /.card-header -->
					<div class="card-body table-responsive p-0">


						<c:if test="${!empty listBatch}">
							<table class="table table-bordered">
								<thead>
									<tr style="font-size: 13px;">
										<th>N°LOT</th>
										<th>NOM LOT</th>
										<th>AUTEUR NUMERISATION</th>
										<th>BASE DOCUMENTAIRE</th>
										<th>DATE NUMERISATION</th>
										<th>FILE NAME</th>
										<th>NOMBRE DE DOCUMENT</th>
										<th>NOMBRE DE PAGE</th>
										<th>STATUT</th>
									</tr>
								</thead>
								<c:forEach items="${listBatch}" var="batch">

									<tbody>
										<tr>
											<td><c:out value="${batch.id}"></c:out></td>
											<td><c:out value="${batch.nom_lot}"></c:out></td>
											<td><c:out value="${batch.auteur_numerisation}"></c:out></td>
											<td><c:out value="${batch.base_doc_lot}"></c:out></td>
											<td><c:out value="${batch.date_numerisation}"></c:out></td>
											<td><c:out value="${batch.file_name}"></c:out></td>
											<td><c:out value="${batch.nb_doc_lot}"></c:out></td>
											<td><c:out value="${batch.nb_page_lot}"></c:out></td>
											<td><c:out value="${batch.statut_lot}"></c:out></td>
										</tr>
										<tr>
									</tbody>

								</c:forEach>

							</table>
						</c:if>

					</div>
					<!-- /.card-body -->
					<%-- <tg:paging pagedLink="${pageLink}"
						pagedListHolder="${pagedListHolder}" /> --%>
					<!-- <div class="card-footer clearfix">
						<ul class="pagination pagination-sm m-0 float-right">
							<li class="page-item"><a class="page-link">&laquo;</a></li>
							<li class="page-item"><a class="page-link">1</a></li>
							<li class="page-item"><a class="page-link">2</a></li>
							<li class="page-item"><a class="page-link">3</a></li>
							<li class="page-item"><a class="page-link">&raquo;</a></li>
						</ul>
					</div> -->
				</div>
				<!-- /.card -->
			</div>
		</div>
		<!-- /.container-fluid -->
	</div>
	<!-- /.content-header -->

	<!-- Main content -->
	<section class="content" style="margin-left: -250px">
		<div class="container-fluid">
			<!-- Small boxes (Stat box) -->
			<div class="row"></div>
		</div>
	</section>
	<!-- ./col -->
</div>
<!-- /.row -->
<!-- /.content -->