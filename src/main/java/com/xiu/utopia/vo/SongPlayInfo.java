package com.xiu.utopia.vo;

/**
 * 歌曲播放信息实体
 */
public class SongPlayInfo {
    /**
     * 歌曲主键
     */
    private Integer id;
    /**
     * 专辑主键
     */
    private String albumId;
    /**
     * 专辑名称
     */
    private String albumName;
    /**
     * 是否有歌词
     */
    private Boolean nolyric;
    /**
     * 歌词转码后的歌词
     */
    private String lyric;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public Boolean getNolyric() {
        return nolyric;
    }

    public void setNolyric(Boolean nolyric) {
        this.nolyric = nolyric;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }
}
