Example Operation Remote Plugin for Easer
======

This is an example Operation Remote Plugin for Easer. It's function is to launch an app's main Activity.

It works from Easer v0.7 (until yet unknown future versions).

Usage
------

You need to launch the main Activity of this app once, in order to let Easer recognize it (you don't need to have Easer open at the same time). 
This is due to Android's secure mechanism which prohibits BroadcastReceiver from working until the app is launched for the first time.

It supports JSON format. The syntax is `{"package": "TARGET_PACKAGE_NAME"}` where `TARGET_PACKAGE_NAME` is the package name of the app you want to launch.

Development
-----

In the development environment, this app locates in the same directory with Easer. Therefore, `../Easer` points to Easer's (repo) directory (for `remote_plugin` module).

I'm exploring ways to publish `remote_plugin` as a library, so a Remote Plugin developer doesn't need to download Easer manually.

License
------

This software is licensed under GPLv3+.

Note this app links to Easer's codebase, which is licensed under GPLv3+.
