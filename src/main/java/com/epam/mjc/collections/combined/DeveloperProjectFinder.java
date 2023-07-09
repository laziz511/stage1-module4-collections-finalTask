package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            String projectName = entry.getKey();
            Set<String> developers = entry.getValue();

            if (developers.contains(developer)) {
                result.add(projectName);
            }
        }

        result.sort((project1, project2) -> {
            int lengthComparison = Integer.compare(project2.length(), project1.length());
            if (lengthComparison != 0) {
                return lengthComparison;
            }
            return project2.compareTo(project1);
        });

        return result;
    }
}


