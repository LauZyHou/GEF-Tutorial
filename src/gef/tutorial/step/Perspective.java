package gef.tutorial.step;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		// 设置Editor为可见
		layout.setEditorAreaVisible(true);
	}
}
