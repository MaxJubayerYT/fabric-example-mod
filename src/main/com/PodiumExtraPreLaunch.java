package com.podiumextra;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class PodiumExtraPreLaunch implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        // Injects the JVM argument globally before Minecraft or Sodium initializes
        System.setProperty("sodium.checks.issue2561", "false");
        System.out.println("[Podium Extra] Injected PojavLauncher bypass property for Sodium!");
    }
}
