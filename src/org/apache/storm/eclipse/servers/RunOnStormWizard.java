package org.apache.storm.eclipse.servers;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.wizard.Wizard;

public class RunOnStormWizard extends Wizard {
	private IFile resource;
	private ILaunchConfigurationWorkingCopy iConf;

	public RunOnStormWizard(IFile resource,
			ILaunchConfigurationWorkingCopy iConfWC) {
		// TODO Auto-generated constructor stub
		this.resource = resource;
		this.iConf = iConf;
	    setForcePreviousAndNextButtons(true);
	    setNeedsProgressMonitor(true);
	    setWindowTitle("Run on Apache Storm Cluster");

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		// TODO Auto-generated method stub

	}

}
