package gef.tutorial.step.ui;

import gef.tutorial.step.model.HelloModel;
import gef.tutorial.step.parts.PartFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;

public class DiagramEditor extends GraphicalEditor {
	// 手动添加一个ID用于标识这个Editor
	public static final String ID = "gef.tutorial.step.ui.DiagramEditor";

	// 视图
	GraphicalViewer viewer;

	public DiagramEditor() {
		// 在构造函数里设置Edit Domain
		/*
		 * Editing domain 管理命令堆栈 command stack、工具条 palette viewer 等。 Editing
		 * domain 还起通知在 Graphicalviewer 中生成的 SWT 事件的作用。 因此，一定要建立一个 Editing
		 * domain。
		 */
		setEditDomain(new DefaultEditDomain(this));
	}

	// 配置视图
	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		viewer = getGraphicalViewer();
		// EditPartFactory将模型Model映射到控制器Part
		viewer.setEditPartFactory(new PartFactory());
	}

	@Override
	protected void initializeGraphicalViewer() {
		// 设置Viewer中显示的内容
		viewer.setContents(new HelloModel());
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

}
