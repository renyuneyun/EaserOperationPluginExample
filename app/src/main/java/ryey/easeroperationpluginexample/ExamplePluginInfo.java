/*
 * Copyright (c) 2018 Rui Zhao <renyuneyun@gmail.com>
 *
 * This file is part of EaserOperationPluginExample.
 *
 * EaserOperationPluginExample is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * EaserOperationPluginExample is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with EaserOperationPluginExample.  If not, see <http://www.gnu.org/licenses/>.
 */

package ryey.easeroperationpluginexample;

public final class ExamplePluginInfo {
    /**
     * ID of the plugin.
     * Should be consistent because Easer will use it to identify plugin.
     */
    public static final String ID = "ryey.easer_operation_plugin_example.plugin_id";

    /**
     * Display name of the plugin.
     * The name will be used directly by Easer, so localization should be done before sending to Easer.
     */
    public static final String NAME = "Example Plugin";

    /**
     * Category of the plugin (required because OperationPlugin)
     * This should be the String representation of one type in {@link ryey.easer.plugin.operation.Category}; otherwise {@code unknown}
     */
    public static final String CATEGORY = "lalalalala"; // Will be treated as "unknown"

    /**
     * The Activity used to edit data.
     */
    public static final String EDIT_DATA_ACTIVITY = EditDataActivity.class.getCanonicalName();
}
