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

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import ryey.easer.commons.PluginDataFormat;
import ryey.easer.remote_plugin.RemoteOperationData;
import ryey.easer.remote_plugin.RemotePlugin;

public class EditDataActivity extends AppCompatActivity {

    private PluginDataFormat format;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);
        Intent intent = getIntent();
        RemoteOperationData remoteOperationData = intent.getParcelableExtra(RemotePlugin.EXTRA_DATA);
        editText = findViewById(R.id.editText);
        editText.setText(remoteOperationData.rawData);
        format = remoteOperationData.format;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.edit_data, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.ok) {
            String data = editText.getText().toString();
            Intent intent = new Intent();
            if (format == null) {
                format = PluginDataFormat.JSON;
            }
            RemoteOperationData remoteOperationData = new RemoteOperationData("ryey.easer_operation_plugin_example.plugin_id", format, data);
            intent.putExtra(RemotePlugin.EXTRA_DATA, remoteOperationData);
            setResult(Activity.RESULT_OK, intent);
            finish();
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }
}
