<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="xml" indent="yes" />
	<xsl:variable name="smallcase"
		select="'abcdefghijklmnopqrstuvwxyz'" />
	<xsl:variable name="uppercase"
		select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'" />

	<xsl:template match="/root">
		<xsl:for-each select="batch">
			<batch>
				<nom_lot>
					<xsl:value-of
						select="field[@name='Batch name']/@value" />
				</nom_lot>
				<auteur_numerisation>
					<xsl:value-of
						select="field[@name='Auteur Numerisation']/@value" />
				</auteur_numerisation>
				<base_doc_lot>
					<xsl:value-of select="field[@name='BASE DRH']/@value" />
				</base_doc_lot>
				<date_numerisation>
					<xsl:value-of
						select="field[@name='Date Numerisation']/@value" />
				</date_numerisation>
				<file_name>
					<xsl:value-of select="field[@name='File Name']/@value" />
				</file_name>
				<nb_page_lot>
					<xsl:value-of
						select="field[@name='Page count in batch']/@value" />
				</nb_page_lot>
				<nb_doc_lot>
					<xsl:value-of
						select="field[@name='Document count in batch']/@value" />
				</nb_doc_lot>
				<statut_lot>
					<xsl:value-of select="field[@name='Statut']/@value" />
				</statut_lot>
			</batch>
		</xsl:for-each>
	</xsl:template>
</xsl:stylesheet>