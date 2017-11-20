package com.zhwts.fcy.androidgallery.bean;

import java.util.List;

/**
 * Created by fcy on 2017/8/7.
 */

public class DiscoverResult extends Result {


    private DataEntity data;

    public void setData(DataEntity data) {
        this.data = data;
    }

    public DataEntity getData() {
        return data;
    }

    public static class DataEntity {
        /**
         * id : 011C290C-2213-77C0-BC4C-971AAA249970
         * backgroundimg : http://gs.sxzhwts.com/uploads/58d21ea8c10db.jpeg
         * signature : 真诚对待每一位朋友
         */

        private List<GuiderEntity> guider;

        public void setGuider(List<GuiderEntity> guider) {
            this.guider = guider;
        }

        public List<GuiderEntity> getGuider() {
            return guider;
        }

        public static class GuiderEntity {
            private String id;
            private String backgroundimg;
            private String signature;

            public void setId(String id) {
                this.id = id;
            }

            public void setBackgroundimg(String backgroundimg) {
                this.backgroundimg = backgroundimg;
            }

            public void setSignature(String signature) {
                this.signature = signature;
            }

            public String getId() {
                return id;
            }

            public String getBackgroundimg() {
                return backgroundimg;
            }

            public String getSignature() {
                return signature;
            }
        }
    }
}
