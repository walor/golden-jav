package com.hp.cidashboard;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import qc.QCReporter;
import anthill.AHPReporter;

import com.urbancode.anthill3.integration.GetMyProjectsResponseDocument;

//import com.urbancode.anthill3.domain.security.AuthorizationException;

public class Middleware {

	private Middleware() {
		throw new AssertionError("Utility classes should not be instantiated");
	}

	public static void main(String... args) {

		anthill.AnthillCertTrustManager ant = new anthill.AnthillCertTrustManager();
		ant.AnthillCertT();

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"context.xml");

		QCReporter reporter = ctx.getBean("qcReporter", QCReporter.class);
		reporter.QCAuthenticationOpen();
		List<Map<String, String>> fields = reporter.getQueryResultsStructure();
		reporter.QCSetQueryParameters(fields, reporter.QC_DEFECT_FIELDS);
		String xd = reporter.QCGetFields();
		// System.out.println(xd);
		List<Map<String, String>> entities = reporter.getQueryResultsEntities();
		System.out.println(entities);
		reporter.QCAuthenticationClose();

		AHPReporter anthillcaller = ctx.getBean("ahpReporter",
				AHPReporter.class);
		GetMyProjectsResponseDocument myprojects = anthillcaller
				.AHPGetMyProjects();
		System.out.println("=======>" + myprojects);

		ctx.close();
	}
}