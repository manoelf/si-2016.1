package br.com.laboratory.model.tasks;

/**
 * Created by manoelferreira on 2/4/17.
 */
public enum Priority {
    NONE, LOW, MEDIUM, HIGH;

    @Override
    public String toString() {
        switch (this.ordinal()) {
            case 1:
                return "LOW";
            case 2:
                return "MEDIUM";
            case 3:
                return "HIGH";


        }
        return "NONE";


    }
}