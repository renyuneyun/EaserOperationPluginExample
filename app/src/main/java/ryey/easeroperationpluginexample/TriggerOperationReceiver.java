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

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import ryey.easer.remote_plugin.RemoteOperationData;
import ryey.easer.remote_plugin.RemotePlugin;

public class TriggerOperationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("TriggerReceiver", "onReceive");
        if (RemotePlugin.OperationPlugin.ACTION_TRIGGER.equals(intent.getAction())) {
            RemoteOperationData remoteOperationData = intent.getParcelableExtra(RemotePlugin.EXTRA_DATA);
            ExampleData data = new ExampleData(remoteOperationData);
            Intent startActivityIntent = context.getPackageManager().getLaunchIntentForPackage(data.packageName);
            context.startActivity(startActivityIntent);
        }
    }
}
