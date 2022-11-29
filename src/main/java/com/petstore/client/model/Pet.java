package com.petstore.client.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * Pet
 */
public class Pet {

    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("category")
    private Category category = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("photoUrls")
    private List<String> photoUrls = new ArrayList<String>();

    @JsonProperty("tags")
    private List<Tag> tags = null;

    /**
     * pet status in the store
     */
    public enum StatusEnum {
        AVAILABLE("available"),

        PENDING("pending"),

        SOLD("sold");

        private final String value;

        StatusEnum(final String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(final String text) {
            for (final StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("status")
    private StatusEnum status = null;

    public Pet id(final Long id) {
        this.id = id;
        return this;
    }

    @ApiModelProperty(value = "")
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Pet category(final Category category) {
        this.category = category;
        return this;
    }

    @ApiModelProperty(value = "")
    @Valid
    public Category getCategory() {
        return category;
    }

    public void setCategory(final Category category) {
        this.category = category;
    }

    public Pet name(final String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(example = "doggie", required = true, value = "")
    @NotNull
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Pet photoUrls(final List<String> photoUrls) {
        this.photoUrls = photoUrls;
        return this;
    }

    public Pet addPhotoUrlsItem(final String photoUrlsItem) {
        this.photoUrls.add(photoUrlsItem);
        return this;
    }

    @ApiModelProperty(required = true, value = "")
    @NotNull
    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(final List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public Pet tags(final List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public Pet addTagsItem(final Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<Tag>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    @ApiModelProperty(value = "")
    @Valid
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(final List<Tag> tags) {
        this.tags = tags;
    }

    public Pet status(final StatusEnum status) {
        this.status = status;
        return this;
    }

    @ApiModelProperty(value = "pet status in the store", allowableValues = "available,pending,sold")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(final StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(final java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Pet pet = (Pet) o;
        return Objects.equals(this.id, pet.id) && Objects.equals(this.category, pet.category) && Objects.equals(this.name, pet.name)
                && Objects.equals(this.photoUrls, pet.photoUrls) && Objects.equals(this.tags, pet.tags) && Objects.equals(this.status, pet.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, name, photoUrls, tags, status);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class Pet {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first line).
     */
    private String toIndentedString(final java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
