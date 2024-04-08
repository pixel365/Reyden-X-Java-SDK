package com.reydenx.models;

/**
 * Supported platforms model
 * 
 * @since 1.0
 * @see com.reydenx.models.OrderParametersModel
 */
public enum PlatformEnum {
    TWITCH {
        public String toString() {
            return "twitch";
        }
    },

    YOUTUBE {
        public String toString() {
            return "youtube";
        }
    },

    GOODGAME {
        public String toString() {
            return "goodgame";
        }
    },

    TROVO {
        public String toString() {
            return "trovo";
        }
    },

    VKPLAY {
        public String toString() {
            return "vkplay";
        }
    }
}
