package com.zirius.zerp.movieApi.entity ;

public class Movie {

		private Long id ;

		private String title;
    
    private Integer year;
    
    private String type;

    private String language;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

    public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}
}