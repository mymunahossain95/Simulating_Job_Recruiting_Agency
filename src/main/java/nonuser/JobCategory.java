package nonuser;

import java.io.Serializable;

public class JobCategory implements Serializable {

        private String categoryId;
        private String categoryName;

        public JobCategory(String categoryId, String categoryName) {
            this.categoryId = categoryId;
            this.categoryName = categoryName;
        }

        public String getCategoryId() {
            return categoryId;
        }

        public String getCategoryName() {
            return categoryName;
        }

        public void setCategoryId(String categoryId) {
            this.categoryId = categoryId;
        }

        public void setCategoryName(String categoryName) {
            this.categoryName = categoryName;
        }

        @Override
        public String toString() {
            return "JobCategory{" +
                    "categoryId='" + categoryId + '\'' +
                    ", categoryName='" + categoryName + '\'' +
                    '}';
        }
    }

