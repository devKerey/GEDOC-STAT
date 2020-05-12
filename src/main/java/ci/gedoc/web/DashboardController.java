package ci.gedoc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ci.gedoc.model.Batch;
import ci.gedoc.repositories.BatchRepository;

@Controller
@RequestMapping("admin/dashboard")
public class DashboardController {

	@Autowired
	private BatchRepository batchRepository;

	@RequestMapping(value = "dashboard", method = RequestMethod.GET)
	public String dashboard() {
		return "admin.dashboard.dashboard";
	}

	@RequestMapping(value = "history", method = RequestMethod.GET)
	public String history(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "size", defaultValue = "5") int s) {
		Page<Batch> pageBatch = batchRepository.findAll(PageRequest.of(p, s));
		model.addAttribute("listBatch", pageBatch.getContent());
		int[] pages = new int[pageBatch.getTotalPages()];
		model.addAttribute("pages", pages);
		return "admin.dashboard.history";
	}
	
	@RequestMapping(value = "event", method = RequestMethod.GET)
	public String event(Model model, @RequestParam(name = "page", defaultValue = "0") int p,
			@RequestParam(name = "size", defaultValue = "5") int s) {
		Page<Batch> pageBatch = batchRepository.findAll(PageRequest.of(p, s));
		model.addAttribute("listBatch", pageBatch.getContent());
		int[] pages = new int[pageBatch.getTotalPages()];
		model.addAttribute("pages", pages);
		return "admin.dashboard.event";
	}

	@RequestMapping(value = "statistics_doc", method = RequestMethod.GET)
	public String statistic_doc() {
		return "admin.dashboard.statistics_doc";
	}
}
