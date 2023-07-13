// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package poc.protobuf.protos;

/**
 * Protobuf type {@code poc.protobuf.AddressBook}
 */
public final class AddressBook extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:poc.protobuf.AddressBook)
    AddressBookOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddressBook.newBuilder() to construct.
  private AddressBook(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddressBook() {
    people_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddressBook();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return poc.protobuf.protos.AddressBookProtos.internal_static_poc_protobuf_AddressBook_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return poc.protobuf.protos.AddressBookProtos.internal_static_poc_protobuf_AddressBook_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            poc.protobuf.protos.AddressBook.class, poc.protobuf.protos.AddressBook.Builder.class);
  }

  public static final int PEOPLE_FIELD_NUMBER = 1;
  private java.util.List<poc.protobuf.protos.Person> people_;
  /**
   * <code>repeated .poc.protobuf.Person people = 1;</code>
   */
  @java.lang.Override
  public java.util.List<poc.protobuf.protos.Person> getPeopleList() {
    return people_;
  }
  /**
   * <code>repeated .poc.protobuf.Person people = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends poc.protobuf.protos.PersonOrBuilder> 
      getPeopleOrBuilderList() {
    return people_;
  }
  /**
   * <code>repeated .poc.protobuf.Person people = 1;</code>
   */
  @java.lang.Override
  public int getPeopleCount() {
    return people_.size();
  }
  /**
   * <code>repeated .poc.protobuf.Person people = 1;</code>
   */
  @java.lang.Override
  public poc.protobuf.protos.Person getPeople(int index) {
    return people_.get(index);
  }
  /**
   * <code>repeated .poc.protobuf.Person people = 1;</code>
   */
  @java.lang.Override
  public poc.protobuf.protos.PersonOrBuilder getPeopleOrBuilder(
      int index) {
    return people_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < people_.size(); i++) {
      output.writeMessage(1, people_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < people_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, people_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof poc.protobuf.protos.AddressBook)) {
      return super.equals(obj);
    }
    poc.protobuf.protos.AddressBook other = (poc.protobuf.protos.AddressBook) obj;

    if (!getPeopleList()
        .equals(other.getPeopleList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPeopleCount() > 0) {
      hash = (37 * hash) + PEOPLE_FIELD_NUMBER;
      hash = (53 * hash) + getPeopleList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static poc.protobuf.protos.AddressBook parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poc.protobuf.protos.AddressBook parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poc.protobuf.protos.AddressBook parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poc.protobuf.protos.AddressBook parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poc.protobuf.protos.AddressBook parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static poc.protobuf.protos.AddressBook parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static poc.protobuf.protos.AddressBook parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static poc.protobuf.protos.AddressBook parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static poc.protobuf.protos.AddressBook parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static poc.protobuf.protos.AddressBook parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static poc.protobuf.protos.AddressBook parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static poc.protobuf.protos.AddressBook parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(poc.protobuf.protos.AddressBook prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code poc.protobuf.AddressBook}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:poc.protobuf.AddressBook)
      poc.protobuf.protos.AddressBookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return poc.protobuf.protos.AddressBookProtos.internal_static_poc_protobuf_AddressBook_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return poc.protobuf.protos.AddressBookProtos.internal_static_poc_protobuf_AddressBook_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              poc.protobuf.protos.AddressBook.class, poc.protobuf.protos.AddressBook.Builder.class);
    }

    // Construct using poc.protobuf.protos.AddressBook.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (peopleBuilder_ == null) {
        people_ = java.util.Collections.emptyList();
      } else {
        people_ = null;
        peopleBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return poc.protobuf.protos.AddressBookProtos.internal_static_poc_protobuf_AddressBook_descriptor;
    }

    @java.lang.Override
    public poc.protobuf.protos.AddressBook getDefaultInstanceForType() {
      return poc.protobuf.protos.AddressBook.getDefaultInstance();
    }

    @java.lang.Override
    public poc.protobuf.protos.AddressBook build() {
      poc.protobuf.protos.AddressBook result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public poc.protobuf.protos.AddressBook buildPartial() {
      poc.protobuf.protos.AddressBook result = new poc.protobuf.protos.AddressBook(this);
      int from_bitField0_ = bitField0_;
      if (peopleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          people_ = java.util.Collections.unmodifiableList(people_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.people_ = people_;
      } else {
        result.people_ = peopleBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof poc.protobuf.protos.AddressBook) {
        return mergeFrom((poc.protobuf.protos.AddressBook)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(poc.protobuf.protos.AddressBook other) {
      if (other == poc.protobuf.protos.AddressBook.getDefaultInstance()) return this;
      if (peopleBuilder_ == null) {
        if (!other.people_.isEmpty()) {
          if (people_.isEmpty()) {
            people_ = other.people_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePeopleIsMutable();
            people_.addAll(other.people_);
          }
          onChanged();
        }
      } else {
        if (!other.people_.isEmpty()) {
          if (peopleBuilder_.isEmpty()) {
            peopleBuilder_.dispose();
            peopleBuilder_ = null;
            people_ = other.people_;
            bitField0_ = (bitField0_ & ~0x00000001);
            peopleBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPeopleFieldBuilder() : null;
          } else {
            peopleBuilder_.addAllMessages(other.people_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              poc.protobuf.protos.Person m =
                  input.readMessage(
                      poc.protobuf.protos.Person.PARSER,
                      extensionRegistry);
              if (peopleBuilder_ == null) {
                ensurePeopleIsMutable();
                people_.add(m);
              } else {
                peopleBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<poc.protobuf.protos.Person> people_ =
      java.util.Collections.emptyList();
    private void ensurePeopleIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        people_ = new java.util.ArrayList<poc.protobuf.protos.Person>(people_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        poc.protobuf.protos.Person, poc.protobuf.protos.Person.Builder, poc.protobuf.protos.PersonOrBuilder> peopleBuilder_;

    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public java.util.List<poc.protobuf.protos.Person> getPeopleList() {
      if (peopleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(people_);
      } else {
        return peopleBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public int getPeopleCount() {
      if (peopleBuilder_ == null) {
        return people_.size();
      } else {
        return peopleBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public poc.protobuf.protos.Person getPeople(int index) {
      if (peopleBuilder_ == null) {
        return people_.get(index);
      } else {
        return peopleBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public Builder setPeople(
        int index, poc.protobuf.protos.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.set(index, value);
        onChanged();
      } else {
        peopleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public Builder setPeople(
        int index, poc.protobuf.protos.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.set(index, builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public Builder addPeople(poc.protobuf.protos.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.add(value);
        onChanged();
      } else {
        peopleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public Builder addPeople(
        int index, poc.protobuf.protos.Person value) {
      if (peopleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePeopleIsMutable();
        people_.add(index, value);
        onChanged();
      } else {
        peopleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public Builder addPeople(
        poc.protobuf.protos.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.add(builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public Builder addPeople(
        int index, poc.protobuf.protos.Person.Builder builderForValue) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.add(index, builderForValue.build());
        onChanged();
      } else {
        peopleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public Builder addAllPeople(
        java.lang.Iterable<? extends poc.protobuf.protos.Person> values) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, people_);
        onChanged();
      } else {
        peopleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public Builder clearPeople() {
      if (peopleBuilder_ == null) {
        people_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        peopleBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public Builder removePeople(int index) {
      if (peopleBuilder_ == null) {
        ensurePeopleIsMutable();
        people_.remove(index);
        onChanged();
      } else {
        peopleBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public poc.protobuf.protos.Person.Builder getPeopleBuilder(
        int index) {
      return getPeopleFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public poc.protobuf.protos.PersonOrBuilder getPeopleOrBuilder(
        int index) {
      if (peopleBuilder_ == null) {
        return people_.get(index);  } else {
        return peopleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public java.util.List<? extends poc.protobuf.protos.PersonOrBuilder> 
         getPeopleOrBuilderList() {
      if (peopleBuilder_ != null) {
        return peopleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(people_);
      }
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public poc.protobuf.protos.Person.Builder addPeopleBuilder() {
      return getPeopleFieldBuilder().addBuilder(
          poc.protobuf.protos.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public poc.protobuf.protos.Person.Builder addPeopleBuilder(
        int index) {
      return getPeopleFieldBuilder().addBuilder(
          index, poc.protobuf.protos.Person.getDefaultInstance());
    }
    /**
     * <code>repeated .poc.protobuf.Person people = 1;</code>
     */
    public java.util.List<poc.protobuf.protos.Person.Builder> 
         getPeopleBuilderList() {
      return getPeopleFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        poc.protobuf.protos.Person, poc.protobuf.protos.Person.Builder, poc.protobuf.protos.PersonOrBuilder> 
        getPeopleFieldBuilder() {
      if (peopleBuilder_ == null) {
        peopleBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            poc.protobuf.protos.Person, poc.protobuf.protos.Person.Builder, poc.protobuf.protos.PersonOrBuilder>(
                people_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        people_ = null;
      }
      return peopleBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:poc.protobuf.AddressBook)
  }

  // @@protoc_insertion_point(class_scope:poc.protobuf.AddressBook)
  private static final poc.protobuf.protos.AddressBook DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new poc.protobuf.protos.AddressBook();
  }

  public static poc.protobuf.protos.AddressBook getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<AddressBook>
      PARSER = new com.google.protobuf.AbstractParser<AddressBook>() {
    @java.lang.Override
    public AddressBook parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AddressBook> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddressBook> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public poc.protobuf.protos.AddressBook getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

