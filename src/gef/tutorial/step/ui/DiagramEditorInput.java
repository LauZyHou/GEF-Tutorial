package gef.tutorial.step.ui;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IPathEditorInput;
import org.eclipse.ui.IPersistableElement;

//每个Editor都要有一个EditorInput作为其内容的提供者
public class DiagramEditorInput implements IPathEditorInput {

	private IPath path;

	public DiagramEditorInput(IPath path) {
		this.path = path;
	}

	@Override
	public boolean exists() {
		return path.toFile().exists();
	}

	@Override
	public ImageDescriptor getImageDescriptor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return path.toString();
	}

	@Override
	public IPersistableElement getPersistable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getToolTipText() {
		return path.toOSString();
	}

	@Override
	public Object getAdapter(Class adapter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPath getPath() {
		return path;
	}

	@Override
	public int hashCode() {
		return path.hashCode();
	}

}
