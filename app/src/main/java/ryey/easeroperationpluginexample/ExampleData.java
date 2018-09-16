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

import org.json.JSONException;
import org.json.JSONObject;

import ryey.easer.commons.PluginDataFormat;
import ryey.easer.remote_plugin.RemoteOperationData;

class ExampleData {
    public final String packageName;

    ExampleData(String packageName) {
        this.packageName = packageName;
    }

    ExampleData(RemoteOperationData remoteOperationData) {
        if (remoteOperationData.format == PluginDataFormat.JSON) {
            try {
                JSONObject jsonObject = new JSONObject(remoteOperationData.rawData);
                packageName = jsonObject.getString("package");
            } catch (JSONException e) {
                e.printStackTrace();
                throw new IllegalStateException();
            }
        } else {
            throw new IllegalAccessError();
        }
    }
}
