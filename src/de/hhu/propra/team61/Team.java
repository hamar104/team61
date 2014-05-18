package de.hhu.propra.team61;

import de.hhu.propra.team61.IO.JSON.JSONArray;
import de.hhu.propra.team61.IO.JSON.JSONObject;
import de.hhu.propra.team61.Objects.Figure;
import javafx.geometry.Point2D;

import java.util.ArrayList;

/**
 * Created by markus on 17.05.14.
 */
public class Team {
    private ArrayList<Figure> figures;

    public Team(ArrayList<Point2D> spawnPoints) {
        figures = new ArrayList<>();
        for(Point2D sp: spawnPoints) { // TODO actually use this
            figures.add(new Figure("Max", 100, 100, false, false, false)); // TODO @Kegny create sensible default constructor
        }
    }

    /**
     * create a team from a given JSONObject
     * @param state the JSONObject representing the team state
     */
    public Team(JSONObject state) {
        figures = new ArrayList<>();
        JSONArray figuresArray = state.getJSONArray("figures");
        for(int i=0; i<figuresArray.length(); i++) {
            figures.add(new Figure(figuresArray.getJSONObject(i)));
        }
    }

    /**
     * @return a JSONObject representing the state of this team, including its figures
     */
    public JSONObject toJson() {
        JSONObject output = new JSONObject();
        JSONArray figuresArray = new JSONArray();
        for(Figure f: figures) {
            figuresArray.put(f.toJson());
        }
        output.put("figures", figuresArray);
        return output;
    }

}