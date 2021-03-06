// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: access.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace DataAccessService {

  /// <summary>Holder for reflection information generated from access.proto</summary>
  public static partial class AccessReflection {

    #region Descriptor
    /// <summary>File descriptor for access.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static AccessReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CgxhY2Nlc3MucHJvdG8SBmFjY2VzcyInChFDYXJkTnVtYmVyUmVxdWVzdBIS",
            "CgpjYXJkTnVtYmVyGAEgASgJIkoKCUNhcmRSZXBseRIOCgRjYXJkGAEgASgJ",
            "SAASIwoFZXJyb3IYAiABKAsyEi5hY2Nlc3MuRXJyb3JSZXBseUgAQggKBnJl",
            "c3VsdCIfCg9TYXZlQ2FyZFJlcXVlc3QSDAoEY2FyZBgBIAEoCSJPCgtBY3Rp",
            "b25SZXBseRIRCgdzdWNjZXNzGAEgASgISAASIwoFZXJyb3IYAiABKAsyEi5h",
            "Y2Nlc3MuRXJyb3JSZXBseUgAQggKBnJlc3VsdCIbCgpFcnJvclJlcGx5Eg0K",
            "BWVycm9yGAEgASgJMoEBCgxEYXRhQWNjZXNzb3ISNwoHR2V0Q2FyZBIZLmFj",
            "Y2Vzcy5DYXJkTnVtYmVyUmVxdWVzdBoRLmFjY2Vzcy5DYXJkUmVwbHkSOAoI",
            "U2F2ZUNhcmQSFy5hY2Nlc3MuU2F2ZUNhcmRSZXF1ZXN0GhMuYWNjZXNzLkFj",
            "dGlvblJlcGx5QhSqAhFEYXRhQWNjZXNzU2VydmljZWIGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::DataAccessService.CardNumberRequest), global::DataAccessService.CardNumberRequest.Parser, new[]{ "CardNumber" }, null, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::DataAccessService.CardReply), global::DataAccessService.CardReply.Parser, new[]{ "Card", "Error" }, new[]{ "Result" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::DataAccessService.SaveCardRequest), global::DataAccessService.SaveCardRequest.Parser, new[]{ "Card" }, null, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::DataAccessService.ActionReply), global::DataAccessService.ActionReply.Parser, new[]{ "Success", "Error" }, new[]{ "Result" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::DataAccessService.ErrorReply), global::DataAccessService.ErrorReply.Parser, new[]{ "Error" }, null, null, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  public sealed partial class CardNumberRequest : pb::IMessage<CardNumberRequest>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<CardNumberRequest> _parser = new pb::MessageParser<CardNumberRequest>(() => new CardNumberRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<CardNumberRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::DataAccessService.AccessReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CardNumberRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CardNumberRequest(CardNumberRequest other) : this() {
      cardNumber_ = other.cardNumber_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CardNumberRequest Clone() {
      return new CardNumberRequest(this);
    }

    /// <summary>Field number for the "cardNumber" field.</summary>
    public const int CardNumberFieldNumber = 1;
    private string cardNumber_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string CardNumber {
      get { return cardNumber_; }
      set {
        cardNumber_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as CardNumberRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(CardNumberRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (CardNumber != other.CardNumber) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (CardNumber.Length != 0) hash ^= CardNumber.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (CardNumber.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(CardNumber);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (CardNumber.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(CardNumber);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (CardNumber.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(CardNumber);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(CardNumberRequest other) {
      if (other == null) {
        return;
      }
      if (other.CardNumber.Length != 0) {
        CardNumber = other.CardNumber;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            CardNumber = input.ReadString();
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 10: {
            CardNumber = input.ReadString();
            break;
          }
        }
      }
    }
    #endif

  }

  public sealed partial class CardReply : pb::IMessage<CardReply>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<CardReply> _parser = new pb::MessageParser<CardReply>(() => new CardReply());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<CardReply> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::DataAccessService.AccessReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CardReply() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CardReply(CardReply other) : this() {
      switch (other.ResultCase) {
        case ResultOneofCase.Card:
          Card = other.Card;
          break;
        case ResultOneofCase.Error:
          Error = other.Error.Clone();
          break;
      }

      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public CardReply Clone() {
      return new CardReply(this);
    }

    /// <summary>Field number for the "card" field.</summary>
    public const int CardFieldNumber = 1;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Card {
      get { return resultCase_ == ResultOneofCase.Card ? (string) result_ : ""; }
      set {
        result_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
        resultCase_ = ResultOneofCase.Card;
      }
    }

    /// <summary>Field number for the "error" field.</summary>
    public const int ErrorFieldNumber = 2;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::DataAccessService.ErrorReply Error {
      get { return resultCase_ == ResultOneofCase.Error ? (global::DataAccessService.ErrorReply) result_ : null; }
      set {
        result_ = value;
        resultCase_ = value == null ? ResultOneofCase.None : ResultOneofCase.Error;
      }
    }

    private object result_;
    /// <summary>Enum of possible cases for the "result" oneof.</summary>
    public enum ResultOneofCase {
      None = 0,
      Card = 1,
      Error = 2,
    }
    private ResultOneofCase resultCase_ = ResultOneofCase.None;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ResultOneofCase ResultCase {
      get { return resultCase_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void ClearResult() {
      resultCase_ = ResultOneofCase.None;
      result_ = null;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as CardReply);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(CardReply other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Card != other.Card) return false;
      if (!object.Equals(Error, other.Error)) return false;
      if (ResultCase != other.ResultCase) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (resultCase_ == ResultOneofCase.Card) hash ^= Card.GetHashCode();
      if (resultCase_ == ResultOneofCase.Error) hash ^= Error.GetHashCode();
      hash ^= (int) resultCase_;
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (resultCase_ == ResultOneofCase.Card) {
        output.WriteRawTag(10);
        output.WriteString(Card);
      }
      if (resultCase_ == ResultOneofCase.Error) {
        output.WriteRawTag(18);
        output.WriteMessage(Error);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (resultCase_ == ResultOneofCase.Card) {
        output.WriteRawTag(10);
        output.WriteString(Card);
      }
      if (resultCase_ == ResultOneofCase.Error) {
        output.WriteRawTag(18);
        output.WriteMessage(Error);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (resultCase_ == ResultOneofCase.Card) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Card);
      }
      if (resultCase_ == ResultOneofCase.Error) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Error);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(CardReply other) {
      if (other == null) {
        return;
      }
      switch (other.ResultCase) {
        case ResultOneofCase.Card:
          Card = other.Card;
          break;
        case ResultOneofCase.Error:
          if (Error == null) {
            Error = new global::DataAccessService.ErrorReply();
          }
          Error.MergeFrom(other.Error);
          break;
      }

      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            Card = input.ReadString();
            break;
          }
          case 18: {
            global::DataAccessService.ErrorReply subBuilder = new global::DataAccessService.ErrorReply();
            if (resultCase_ == ResultOneofCase.Error) {
              subBuilder.MergeFrom(Error);
            }
            input.ReadMessage(subBuilder);
            Error = subBuilder;
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 10: {
            Card = input.ReadString();
            break;
          }
          case 18: {
            global::DataAccessService.ErrorReply subBuilder = new global::DataAccessService.ErrorReply();
            if (resultCase_ == ResultOneofCase.Error) {
              subBuilder.MergeFrom(Error);
            }
            input.ReadMessage(subBuilder);
            Error = subBuilder;
            break;
          }
        }
      }
    }
    #endif

  }

  public sealed partial class SaveCardRequest : pb::IMessage<SaveCardRequest>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<SaveCardRequest> _parser = new pb::MessageParser<SaveCardRequest>(() => new SaveCardRequest());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<SaveCardRequest> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::DataAccessService.AccessReflection.Descriptor.MessageTypes[2]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SaveCardRequest() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SaveCardRequest(SaveCardRequest other) : this() {
      card_ = other.card_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public SaveCardRequest Clone() {
      return new SaveCardRequest(this);
    }

    /// <summary>Field number for the "card" field.</summary>
    public const int CardFieldNumber = 1;
    private string card_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Card {
      get { return card_; }
      set {
        card_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as SaveCardRequest);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(SaveCardRequest other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Card != other.Card) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Card.Length != 0) hash ^= Card.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (Card.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Card);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (Card.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Card);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Card.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Card);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(SaveCardRequest other) {
      if (other == null) {
        return;
      }
      if (other.Card.Length != 0) {
        Card = other.Card;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            Card = input.ReadString();
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 10: {
            Card = input.ReadString();
            break;
          }
        }
      }
    }
    #endif

  }

  public sealed partial class ActionReply : pb::IMessage<ActionReply>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<ActionReply> _parser = new pb::MessageParser<ActionReply>(() => new ActionReply());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<ActionReply> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::DataAccessService.AccessReflection.Descriptor.MessageTypes[3]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ActionReply() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ActionReply(ActionReply other) : this() {
      switch (other.ResultCase) {
        case ResultOneofCase.Success:
          Success = other.Success;
          break;
        case ResultOneofCase.Error:
          Error = other.Error.Clone();
          break;
      }

      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ActionReply Clone() {
      return new ActionReply(this);
    }

    /// <summary>Field number for the "success" field.</summary>
    public const int SuccessFieldNumber = 1;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Success {
      get { return resultCase_ == ResultOneofCase.Success ? (bool) result_ : false; }
      set {
        result_ = value;
        resultCase_ = ResultOneofCase.Success;
      }
    }

    /// <summary>Field number for the "error" field.</summary>
    public const int ErrorFieldNumber = 2;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::DataAccessService.ErrorReply Error {
      get { return resultCase_ == ResultOneofCase.Error ? (global::DataAccessService.ErrorReply) result_ : null; }
      set {
        result_ = value;
        resultCase_ = value == null ? ResultOneofCase.None : ResultOneofCase.Error;
      }
    }

    private object result_;
    /// <summary>Enum of possible cases for the "result" oneof.</summary>
    public enum ResultOneofCase {
      None = 0,
      Success = 1,
      Error = 2,
    }
    private ResultOneofCase resultCase_ = ResultOneofCase.None;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ResultOneofCase ResultCase {
      get { return resultCase_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void ClearResult() {
      resultCase_ = ResultOneofCase.None;
      result_ = null;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as ActionReply);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(ActionReply other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Success != other.Success) return false;
      if (!object.Equals(Error, other.Error)) return false;
      if (ResultCase != other.ResultCase) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (resultCase_ == ResultOneofCase.Success) hash ^= Success.GetHashCode();
      if (resultCase_ == ResultOneofCase.Error) hash ^= Error.GetHashCode();
      hash ^= (int) resultCase_;
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (resultCase_ == ResultOneofCase.Success) {
        output.WriteRawTag(8);
        output.WriteBool(Success);
      }
      if (resultCase_ == ResultOneofCase.Error) {
        output.WriteRawTag(18);
        output.WriteMessage(Error);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (resultCase_ == ResultOneofCase.Success) {
        output.WriteRawTag(8);
        output.WriteBool(Success);
      }
      if (resultCase_ == ResultOneofCase.Error) {
        output.WriteRawTag(18);
        output.WriteMessage(Error);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (resultCase_ == ResultOneofCase.Success) {
        size += 1 + 1;
      }
      if (resultCase_ == ResultOneofCase.Error) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Error);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(ActionReply other) {
      if (other == null) {
        return;
      }
      switch (other.ResultCase) {
        case ResultOneofCase.Success:
          Success = other.Success;
          break;
        case ResultOneofCase.Error:
          if (Error == null) {
            Error = new global::DataAccessService.ErrorReply();
          }
          Error.MergeFrom(other.Error);
          break;
      }

      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 8: {
            Success = input.ReadBool();
            break;
          }
          case 18: {
            global::DataAccessService.ErrorReply subBuilder = new global::DataAccessService.ErrorReply();
            if (resultCase_ == ResultOneofCase.Error) {
              subBuilder.MergeFrom(Error);
            }
            input.ReadMessage(subBuilder);
            Error = subBuilder;
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 8: {
            Success = input.ReadBool();
            break;
          }
          case 18: {
            global::DataAccessService.ErrorReply subBuilder = new global::DataAccessService.ErrorReply();
            if (resultCase_ == ResultOneofCase.Error) {
              subBuilder.MergeFrom(Error);
            }
            input.ReadMessage(subBuilder);
            Error = subBuilder;
            break;
          }
        }
      }
    }
    #endif

  }

  public sealed partial class ErrorReply : pb::IMessage<ErrorReply>
  #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      , pb::IBufferMessage
  #endif
  {
    private static readonly pb::MessageParser<ErrorReply> _parser = new pb::MessageParser<ErrorReply>(() => new ErrorReply());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<ErrorReply> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::DataAccessService.AccessReflection.Descriptor.MessageTypes[4]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ErrorReply() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ErrorReply(ErrorReply other) : this() {
      error_ = other.error_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public ErrorReply Clone() {
      return new ErrorReply(this);
    }

    /// <summary>Field number for the "error" field.</summary>
    public const int ErrorFieldNumber = 1;
    private string error_ = "";
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Error {
      get { return error_; }
      set {
        error_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as ErrorReply);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(ErrorReply other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Error != other.Error) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Error.Length != 0) hash ^= Error.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      output.WriteRawMessage(this);
    #else
      if (Error.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Error);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalWriteTo(ref pb::WriteContext output) {
      if (Error.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Error);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(ref output);
      }
    }
    #endif

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Error.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Error);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(ErrorReply other) {
      if (other == null) {
        return;
      }
      if (other.Error.Length != 0) {
        Error = other.Error;
      }
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
      input.ReadRawMessage(this);
    #else
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            Error = input.ReadString();
            break;
          }
        }
      }
    #endif
    }

    #if !GOOGLE_PROTOBUF_REFSTRUCT_COMPATIBILITY_MODE
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    void pb::IBufferMessage.InternalMergeFrom(ref pb::ParseContext input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, ref input);
            break;
          case 10: {
            Error = input.ReadString();
            break;
          }
        }
      }
    }
    #endif

  }

  #endregion

}

#endregion Designer generated code
