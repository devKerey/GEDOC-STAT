<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tg" tagdir="/WEB-INF/tags"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div class="content-wrapper">	
<div class="content-header">
		<div class="container-fluid">
			<div class="row mb-2">
				<div class="col-sm-6">
					<h2 class="card-title">
						<i class="fas fa-chart-pie mr-1"></i> SATISTIQUES DOCUMENTS
					</h2>
				</div>
			</div>
			<br />
			<form role="form">
				<div class="row">
					<div class="col-sm-3">
						<!-- text input -->
						<div class="form-group">
							<label>ACTEUR DOCUMENT</label> <input type="text" class="form-control"
								placeholder="Ex: Laurent Kerey">
						</div>
					</div>
					<div class="col-sm-3">
						<!-- text input -->
						<div class="form-group">
							<label>TACHE</label> <input type="text"
								class="form-control" placeholder="Ex: DRH12-03-2020-162537-sysadmin-1-001">
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
						<label>DATE:</label>

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
							<label>CAUSE DU REJET</label> <input type="text" class="form-control"
								placeholder="Ex: Probleme sur le document">
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
							<table class="table table-bordered">
								<thead>
									<tr style="font-size: 13px;">
										<th>ACTEUR DOCUMENT</th>
										<th>TACHE</th>
										<th>BASE DOCUMENTAIRE</th>
										<th>DATE</th>
										<th>CAUSE DU REJET</th>
										<th>NOMBRE DE PAGE</th>
										<th>STATUT</th>
										<th colspan="2" style="text-align: center;">ACTIONS</th>
									</tr>
								</thead>

									<tbody>
										<tr>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td></td>
											<td><button type="button"
													class="btn btn-block btn-primary btn-flat">
													<i class="fas fa-edit"></i>
												</button></td>
											<td><button type="button"
													class="btn btn-block btn-danger btn-flat">
													<i class="fas fa-trash"></i>
												</button></td>
										</tr>
										<tr>
									</tbody>

							</table>
					</div>
				</div>
				<!-- /.card -->
			</div>
		</div>
		<!-- /.container-fluid -->
		<!-- /.content-header -->

		<!-- Main content -->
		<section class="content" style="margin-left: -250px">
			<div class="container-fluid">
				<!-- Small boxes (Stat box) -->
				<div class="row"></div>
			</div>
		</section>
		<!-- /.row -->
		<!-- /.content -->
</div>
</div>