package com.booksaw.betterTeams.customEvents.post;

import com.booksaw.betterTeams.Team;
import com.booksaw.betterTeams.customEvents.TeamEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * An event which is called right before the creation of a {@link Team}
 */
public class PostCreateTeamEvent extends TeamEvent {

    private static final HandlerList HANDLERS = new HandlerList();
    private final Player player;

    public PostCreateTeamEvent(Team team, Player player) {
        super(team, true);
        this.player = player;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return player;
    }

}
