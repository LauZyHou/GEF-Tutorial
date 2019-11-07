package gef.tutorial.step.actions;

import gef.tutorial.step.Application;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class DiagramAction extends Action implements ISelectionListener,
		IWorkbenchAction {
	private final IWorkbenchWindow window;
	public final static String ID = "gef.step.diagram";
	private IStructuredSelection selection;

	// 构造函数
	public DiagramAction(IWorkbenchWindow window) {
		this.window = window;
		setId(ID);
		setText("&Diagram");
		setToolTipText("Draw the GEF diagram.");
		setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(
				Application.PLUGIN_ID, "icons/online.png"));
		window.getSelectionService().addSelectionListener(this);
	}

	@Override
	public void dispose() {

	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {

	}

}
