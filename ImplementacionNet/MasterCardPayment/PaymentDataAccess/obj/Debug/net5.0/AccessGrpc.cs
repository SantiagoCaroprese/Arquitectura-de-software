// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: access.proto
// </auto-generated>
#pragma warning disable 0414, 1591
#region Designer generated code

using grpc = global::Grpc.Core;

namespace DataAccessService {
  public static partial class DataAccessor
  {
    static readonly string __ServiceName = "access.DataAccessor";

    static void __Helper_SerializeMessage(global::Google.Protobuf.IMessage message, grpc::SerializationContext context)
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (message is global::Google.Protobuf.IBufferMessage)
      {
        context.SetPayloadLength(message.CalculateSize());
        global::Google.Protobuf.MessageExtensions.WriteTo(message, context.GetBufferWriter());
        context.Complete();
        return;
      }
      #endif
      context.Complete(global::Google.Protobuf.MessageExtensions.ToByteArray(message));
    }

    static class __Helper_MessageCache<T>
    {
      public static readonly bool IsBufferMessage = global::System.Reflection.IntrospectionExtensions.GetTypeInfo(typeof(global::Google.Protobuf.IBufferMessage)).IsAssignableFrom(typeof(T));
    }

    static T __Helper_DeserializeMessage<T>(grpc::DeserializationContext context, global::Google.Protobuf.MessageParser<T> parser) where T : global::Google.Protobuf.IMessage<T>
    {
      #if !GRPC_DISABLE_PROTOBUF_BUFFER_SERIALIZATION
      if (__Helper_MessageCache<T>.IsBufferMessage)
      {
        return parser.ParseFrom(context.PayloadAsReadOnlySequence());
      }
      #endif
      return parser.ParseFrom(context.PayloadAsNewBuffer());
    }

    static readonly grpc::Marshaller<global::DataAccessService.CardNumberRequest> __Marshaller_access_CardNumberRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::DataAccessService.CardNumberRequest.Parser));
    static readonly grpc::Marshaller<global::DataAccessService.CardReply> __Marshaller_access_CardReply = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::DataAccessService.CardReply.Parser));
    static readonly grpc::Marshaller<global::DataAccessService.SaveCardRequest> __Marshaller_access_SaveCardRequest = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::DataAccessService.SaveCardRequest.Parser));
    static readonly grpc::Marshaller<global::DataAccessService.ActionReply> __Marshaller_access_ActionReply = grpc::Marshallers.Create(__Helper_SerializeMessage, context => __Helper_DeserializeMessage(context, global::DataAccessService.ActionReply.Parser));

    static readonly grpc::Method<global::DataAccessService.CardNumberRequest, global::DataAccessService.CardReply> __Method_GetCard = new grpc::Method<global::DataAccessService.CardNumberRequest, global::DataAccessService.CardReply>(
        grpc::MethodType.Unary,
        __ServiceName,
        "GetCard",
        __Marshaller_access_CardNumberRequest,
        __Marshaller_access_CardReply);

    static readonly grpc::Method<global::DataAccessService.SaveCardRequest, global::DataAccessService.ActionReply> __Method_SaveCard = new grpc::Method<global::DataAccessService.SaveCardRequest, global::DataAccessService.ActionReply>(
        grpc::MethodType.Unary,
        __ServiceName,
        "SaveCard",
        __Marshaller_access_SaveCardRequest,
        __Marshaller_access_ActionReply);

    /// <summary>Service descriptor</summary>
    public static global::Google.Protobuf.Reflection.ServiceDescriptor Descriptor
    {
      get { return global::DataAccessService.AccessReflection.Descriptor.Services[0]; }
    }

    /// <summary>Client for DataAccessor</summary>
    public partial class DataAccessorClient : grpc::ClientBase<DataAccessorClient>
    {
      /// <summary>Creates a new client for DataAccessor</summary>
      /// <param name="channel">The channel to use to make remote calls.</param>
      public DataAccessorClient(grpc::ChannelBase channel) : base(channel)
      {
      }
      /// <summary>Creates a new client for DataAccessor that uses a custom <c>CallInvoker</c>.</summary>
      /// <param name="callInvoker">The callInvoker to use to make remote calls.</param>
      public DataAccessorClient(grpc::CallInvoker callInvoker) : base(callInvoker)
      {
      }
      /// <summary>Protected parameterless constructor to allow creation of test doubles.</summary>
      protected DataAccessorClient() : base()
      {
      }
      /// <summary>Protected constructor to allow creation of configured clients.</summary>
      /// <param name="configuration">The client configuration.</param>
      protected DataAccessorClient(ClientBaseConfiguration configuration) : base(configuration)
      {
      }

      public virtual global::DataAccessService.CardReply GetCard(global::DataAccessService.CardNumberRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetCard(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual global::DataAccessService.CardReply GetCard(global::DataAccessService.CardNumberRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_GetCard, null, options, request);
      }
      public virtual grpc::AsyncUnaryCall<global::DataAccessService.CardReply> GetCardAsync(global::DataAccessService.CardNumberRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return GetCardAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncUnaryCall<global::DataAccessService.CardReply> GetCardAsync(global::DataAccessService.CardNumberRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_GetCard, null, options, request);
      }
      public virtual global::DataAccessService.ActionReply SaveCard(global::DataAccessService.SaveCardRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return SaveCard(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual global::DataAccessService.ActionReply SaveCard(global::DataAccessService.SaveCardRequest request, grpc::CallOptions options)
      {
        return CallInvoker.BlockingUnaryCall(__Method_SaveCard, null, options, request);
      }
      public virtual grpc::AsyncUnaryCall<global::DataAccessService.ActionReply> SaveCardAsync(global::DataAccessService.SaveCardRequest request, grpc::Metadata headers = null, global::System.DateTime? deadline = null, global::System.Threading.CancellationToken cancellationToken = default(global::System.Threading.CancellationToken))
      {
        return SaveCardAsync(request, new grpc::CallOptions(headers, deadline, cancellationToken));
      }
      public virtual grpc::AsyncUnaryCall<global::DataAccessService.ActionReply> SaveCardAsync(global::DataAccessService.SaveCardRequest request, grpc::CallOptions options)
      {
        return CallInvoker.AsyncUnaryCall(__Method_SaveCard, null, options, request);
      }
      /// <summary>Creates a new instance of client from given <c>ClientBaseConfiguration</c>.</summary>
      protected override DataAccessorClient NewInstance(ClientBaseConfiguration configuration)
      {
        return new DataAccessorClient(configuration);
      }
    }

  }
}
#endregion
