package gef.tutorial.step;

import gef.tutorial.step.actions.DiagramAction;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {
	// exit菜单
	private IWorkbenchAction exitAction;
	// about菜单
	private IWorkbenchAction aboutAction;
	// 图表菜单
	private DiagramAction diagramAction;

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}

	// 为Action赋值(指派功能),并注册
	protected void makeActions(IWorkbenchWindow window) {
		this.exitAction = ActionFactory.QUIT.create(window);
		this.register(exitAction);
		this.aboutAction = ActionFactory.ABOUT.create(window);
		this.register(aboutAction);
		this.diagramAction = new DiagramAction(window);
		this.register(diagramAction);

	}

	// 添加到菜单栏
	protected void fillMenuBar(IMenuManager menuBar) {
		MenuManager fileMenu = new MenuManager("&File", "File");
		fileMenu.add(this.diagramAction);
		fileMenu.add(new Separator());
		fileMenu.add(this.exitAction);
		MenuManager helpMenu = new MenuManager("&Help", "Help");
		helpMenu.add(aboutAction);
		menuBar.add(fileMenu);
		menuBar.add(helpMenu);
	}

}
