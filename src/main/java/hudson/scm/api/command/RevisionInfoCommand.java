// $Id: $
// (c) Copyright 2015 by PTC Inc. All rights reserved.
//
// This Software is unpublished, valuable, confidential property of
// PTC Inc. Any use or disclosure of this Software without the express
// written permission of PTC Inc. is strictly prohibited.

package hudson.scm.api.command;

import com.mks.api.Command;

import hudson.scm.IntegrityConfigurable;

/**
 * Revision Info command for the Integrity Jenkins Plugin
 * 
 * @author Author: asen
 * @version $Revision: $
 */
public class RevisionInfoCommand extends BasicAPICommand
{
    protected RevisionInfoCommand(final IntegrityConfigurable serverConfig)
    {
	super(serverConfig);
	cmd = new Command(Command.SI, REVISION_INFO_COMMAND);
    }
    
}
