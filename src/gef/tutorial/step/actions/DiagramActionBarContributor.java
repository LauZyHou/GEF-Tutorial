package gef.tutorial.step.actions;

import org.eclipse.gef.ui.actions.ActionBarContributor;
import org.eclipse.gef.ui.actions.RedoRetargetAction;
import org.eclipse.gef.ui.actions.UndoRetargetAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.actions.ActionFactory;

public class DiagramActionBarContributor extends ActionBarContributor {

	@Override
	protected void buildActions() {
		// 添加undo和redo的Action
		// RetargetAction是具有一定语义但没有实际功能的Action
		// 就是在主菜单条或者在主工具条上占据一个位置
		// 可以将具有实际功能的Action映射到某个RetargetAction
		addRetargetAction(new UndoRetargetAction());
		addRetargetAction(new RedoRetargetAction());
	}

	@Override
	protected void declareGlobalActionKeys() {
		// TODO Auto-generated method stub

	}

	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		// 添加undo和redo的工具栏按钮
		toolBarManager.add(getAction(ActionFactory.UNDO.getId()));
		toolBarManager.add(getAction(ActionFactory.REDO.getId()));
	}

}
