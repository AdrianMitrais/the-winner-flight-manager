package org.thewinner.commands;

import org.springframework.shell.standard.ShellOption;

/**
 * The interface User select commands.
 */
public interface UserSelectCommands {
    /**
     * Function to set role of user
     *
     * @param user who to login as
     */
    void login(@ShellOption(defaultValue = "no-user") String user);

    /**
     * Function to log user out of roles
     */
    void logout();

    /**
     * Check current user roles
     *
     * @return currently used roles
     */
    String checkUser();
}
