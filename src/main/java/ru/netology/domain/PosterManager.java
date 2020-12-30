package ru.netology.domain;

public class PosterManager {


        PosterData[] posters = {
                new PosterData(1,"title1", "genre1"),
                new PosterData(2,"title2", "genre2"),
                new PosterData(3,"title3", "genre3"),
                new PosterData(4,"title4", "genre4"),
                new PosterData(5,"title5", "genre5"),
                new PosterData(6,"title6", "genre6"),
                new PosterData(7,"title7", "genre7"),
                new PosterData(8,"title8", "genre8"),
                new PosterData(9,"title9", "genre9"),

        };

        public void addMovie(PosterData poster) {

            int length = posters.length + 1;
            PosterData[] tmp = new PosterData[length];

            for (int i = 0; i < posters.length; i++) {
                tmp[i] = posters[i];
            }

            int lastIndex = tmp.length - 1;
            tmp[lastIndex] = poster;
            posters = tmp;
        }


        public PosterData[] getAllMovies(int numberOfMoviesInManager) {

            int defaultNumberToShow = 10;

            if(numberOfMoviesInManager <= 0) {

                numberOfMoviesInManager = defaultNumberToShow;
            }

            if(defaultNumberToShow > posters.length) {

                defaultNumberToShow = posters.length;
            }

            if (numberOfMoviesInManager <= defaultNumberToShow) {

                defaultNumberToShow = numberOfMoviesInManager;
            } else {
                defaultNumberToShow = posters.length;
            }

            PosterData[] result = new PosterData[defaultNumberToShow];

            for (int i = 0; i < result.length; i++) {
                int index = posters.length - i - 1;
                result[i] = posters[index];

            }

            return result;
        }
}
