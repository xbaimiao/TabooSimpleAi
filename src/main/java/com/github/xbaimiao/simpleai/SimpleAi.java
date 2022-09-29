package com.github.xbaimiao.simpleai;

import org.bukkit.entity.LivingEntity;
import taboolib.module.ai.SimpleAiExecutorKt;

public abstract class SimpleAi extends taboolib.module.ai.SimpleAi {

    public static void addGoalAi(LivingEntity entity, SimpleAi ai, int priority) {
        SimpleAiExecutorKt.addGoalAi(entity, ai, priority);
    }

    public static void addTargetAi(LivingEntity entity, SimpleAi ai, int priority) {
        SimpleAiExecutorKt.addTargetAi(entity, ai, priority);
    }

    public static void clearGoalAi(LivingEntity entity) {
        SimpleAiExecutorKt.clearGoalAi(entity);
    }

    public static void clearTargetAi(LivingEntity entity) {
        SimpleAiExecutorKt.clearTargetAi(entity);
    }

    public static void removeGoalAi(LivingEntity entity, String name) {
        SimpleAiExecutorKt.removeGoalAi(entity, name);
    }

    public static void removeGoalAi(LivingEntity entity, int priority) {
        SimpleAiExecutorKt.removeGoalAi(entity, priority);
    }

    public static void removeTargetAi(LivingEntity entity, String name) {
        SimpleAiExecutorKt.removeTargetAi(entity, name);
    }

    public static void removeTargetAi(LivingEntity entity, int priority) {
        SimpleAiExecutorKt.removeTargetAi(entity, priority);
    }

}
