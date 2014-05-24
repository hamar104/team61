package de.hhu.propra.team61.IO;

import de.hhu.propra.team61.IO.JSON.JSONObject;

/**
 * Created by jessy on 24.05.14.
 */
public class Settings {

    static String file;

    /**
     * @param json is saved to SETTINGS_FILE
     */
    public static void save(JSONObject json, String file) {
        file = file+".conf";
        Json.save(json, file);
    }

    /**
     * @return game state from SAVE_STATE_FILE
     */
    public static JSONObject getSavedSettings() {
        return Json.getFromFile(file);
    }

}
