package com.theironyard.charlotte.demo.models;

import java.util.List;

/**
 * Created by BUBBABAIRD on 5/22/17.
 */
public class NASAData {
    NASACollection collection;

    public NASACollection getCollection() {
        return collection;
    }

    public void setCollection(NASACollection collection) {
        this.collection = collection;
    }

    public static class NASACollection {
        List<NASAItem> items;

        public List<NASAItem> getItems() {
            return items;
        }

        public void setItems(List<NASAItem> items) {
            this.items = items;
        }

        public static class NASAItem {
            List<Link> links;
            List<NASAAssetData> data;

            public List<NASAAssetData> getData() {
                return data;
            }

            public void setData(List<NASAAssetData> data) {
                this.data = data;
            }

            public List<Link> getLinks() {
                return links;
            }

            public void setLinks(List<Link> links) {
                this.links = links;
            }

            public static class Link {
                String rel;
                String href;
                String render;

                public String getRel() {
                    return rel;
                }

                public void setRel(String rel) {
                    this.rel = rel;
                }

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }

                public String getRender() {
                    return render;
                }

                public void setRender(String render) {
                    this.render = render;
                }
            }

            public static class NASAAssetData {
                String nasaId;
                List<String> keywords;
                String title;
                String media_type;

                public String getMedia_type() {
                    return media_type;
                }

                public void setMedia_type(String media_type) {
                    this.media_type = media_type;
                }

                public String getNasaId() {
                    return nasaId;
                }

                public void setNasaId(String nasaId) {
                    this.nasaId = nasaId;
                }

                public List<String> getKeywords() {
                    return keywords;
                }

                public void setKeywords(List<String> keywords) {
                    this.keywords = keywords;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }
            }
        }
    }
}
