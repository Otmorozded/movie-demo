package ru.netology.manager;

import ru.netology.domain.PosterData;

public class PosterManager {

  private PosterData[] posters = new PosterData[0];


  public PosterManager() {
  }



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
