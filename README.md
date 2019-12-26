Example Operation Remote Plugin for Easer
======

This is an example Operation Remote Plugin for Easer. It's function is to launch an app's main Activity.

It works from Easer v0.7.9 (until yet unknown future versions).

Usage
------

You need to launch the main Activity of this app once, in order to let Easer recognize it (you don't need to have Easer open at the same time). 
This is due to Android's secure mechanism which prohibits BroadcastReceiver from working until the app is launched for the first time.

It supports JSON format. The syntax is `{"package": "TARGET_PACKAGE_NAME"}` where `TARGET_PACKAGE_NAME` is the package name of the app you want to launch.

Development
-----

The key part is to use the `plugin` module of Easer. Therefore, this project uses `jitpack` to convert Easer's repository to a library.

Particularly, two `build.gradle` files needs to be modified. See [this page](https://jitpack.io/#renyuneyun/Easer/) for more details.

License
------

This software is licensed under GPLv3+.

Note this app links to Easer's codebase, which is licensed under GPLv3+.
