package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.ashokit.reports.IReport;

@Service
public class ReportService {

 @Autowired
 @Qualifier("excel")
 private IReport excelreport;
 
 @Autowired
 @Qualifier("pdf")
 private IReport pdfreport;
 
 public void generate() {
	 System.out.println("Injected::"+ excelreport.getClass().getName());
	 report.generateReport();
 }
}
