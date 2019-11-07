package gef.tutorial.step.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.ui.parts.GraphicalEditor;

public class DiagramEditor extends GraphicalEditor {
	// 手动添加一个ID用于标识这个Editor
	public static final String ID = "gef.tutorial.step.ui.DiagramEditor";

	@Override
	protected void initializeGraphicalViewer() {
		// TODO Auto-generated method stub

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
