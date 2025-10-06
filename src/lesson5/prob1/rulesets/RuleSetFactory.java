package lesson5.prob1.rulesets;

import lesson5.prob1.gui.BookWindow;
import lesson5.prob1.gui.CDWindow;

import java.awt.Component;
import java.util.HashMap;



 public final class RuleSetFactory {
	private RuleSetFactory(){}
	public static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	 static {
		 map.put(BookWindow.class, new BookRuleSet());
		 map.put(CDWindow.class, new CDRuleSet());
	 }
}
