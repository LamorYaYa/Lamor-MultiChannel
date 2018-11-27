package com.example.master.lamor_multichannel.bean;

import java.util.List;

public class AppBean {

    private int hasNext;
    private java.util.List<ListBean> List;

    public int getHasNext() {
        return hasNext;
    }

    public void setHasNext(int hasNext) {
        this.hasNext = hasNext;
    }

    public List<ListBean> getList() {
        return List;
    }

    public void setList(List<ListBean> List) {
        this.List = List;
    }

    public static class ListBean {
        /**
         * id : 39
         * name : 傀儡战争
         * code : kuileizhanzheng
         * version : 1.0
         * des : 傀儡战争是一款 3D 过关类动作游戏。傀儡战争下载后玩家将操控游戏中的小主人公，拿起武器和木偶军团来场肉搏大战。说起游戏中的动作元素，本作可要比很多同类游戏出色，丰富多元的动作元素让游戏可玩性更高。
         * detail : 傀儡战争是一款 3D 过关类动作游戏。傀儡战争下载后玩家将操控游戏中的小主人公，拿起武器和木偶军团来场肉搏大战。说起游戏中的动作元素，本作可要比很多同类游戏出色，丰富多元的动作元素让游戏可玩性更高，同时也是对玩家操作的一种考验，而且这些动作都有着各自的用途，玩家在实战中会体会到。
         * images : {"image1":"https://abox-file.oss-cn-beijing.aliyuncs.com/image/363959b7-dc94-4c9e-917c-6709ee991bbf.png","image2":"https://abox-file.oss-cn-beijing.aliyuncs.com/image/f7c7f151-3449-4429-8cc7-c065bb31fc50.png","image3":"https://abox-file.oss-cn-beijing.aliyuncs.com/image/5c6c6d6d-31f4-4f10-98f2-81ea151b3b3c.png"}
         * price : 0.0
         * createTime : 2018-11-21 18:37:54
         * updateTime : 2018-11-23 11:55:05
         * mainClass : com.prime31.UnityPlayerProxyActivity
         * md5 : 0d8caa34fc6c9fc647db3ade17e63f78
         * packageName : com.xpec.ClashPuooets
         */

        private int id;
        private String name;
        private String code;
        private String version;
        private String des;
        private String detail;
        private String images;
        private double price;
        private String createTime;
        private String updateTime;
        private String mainClass;
        private String md5;
        private String packageName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getImages() {
            return images;
        }

        public void setImages(String images) {
            this.images = images;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public String getMainClass() {
            return mainClass;
        }

        public void setMainClass(String mainClass) {
            this.mainClass = mainClass;
        }

        public String getMd5() {
            return md5;
        }

        public void setMd5(String md5) {
            this.md5 = md5;
        }

        public String getPackageName() {
            return packageName;
        }

        public void setPackageName(String packageName) {
            this.packageName = packageName;
        }
    }


    @Override
    public String toString() {
        return "AppBean{" +
                "hasNext=" + hasNext +
                ", List={" + List + "}" +
                '}';
    }
}
