package gef.tutorial.step.actions;

import gef.tutorial.step.Application;
import gef.tutorial.step.ui.DiagramEditor;
import gef.tutorial.step.ui.DiagramEditorInput;

import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
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
		// 在这里的动作是点击Diagram菜单执行的动作,这里是打开一个对话框
		String path = openFileDialog();
		if (path != null) {
			IEditorInput input = new DiagramEditorInput(new Path(path));
			IWorkbenchPage page = window.getActivePage();
			try {
				// 打开编辑器
				page.openEditor(input, DiagramEditor.ID, true);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	// 打开对话框
	private String openFileDialog() {
		FileDialog dialog = new FileDialog(window.getShell(), SWT.OPEN);
		dialog.setText("GEF文件");
		// 设置文件的扩展名
		dialog.setFilterExtensions(new String[] { "*.diagram", "*" });
		return dialog.open();
	}

}
