package p008c.p009a.p016c;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.qualifier.Qualifier;
import org.koin.dsl.ModuleKt;
import org.mobileid.requester.web_service.simple_key.SimpleKeyWebService;
import org.mobileid.time_key.web_service.TimeKeyWebService;
import p008c.p009a.p010a.p011d.C0840a;
import p008c.p009a.p010a.p013f.C0846a;
import p008c.p009a.p017d.p019b.C0933e;
import p008c.p009a.p017d.p021d.C0946a;
import p008c.p009a.p017d.p021d.p022e.C0950a;
import p008c.p009a.p024e.p025a.C0959a;
import p008c.p009a.p024e.p026b.C0962a;
import p008c.p009a.p024e.p027c.C0972a;
import p008c.p009a.p024e.p027c.p028c.C0978c;
import p008c.p009a.p024e.p029d.C0980a;
import p008c.p009a.p024e.p030e.C0984b;

/* renamed from: c.a.c.n */
public final class C0908n {

    /* renamed from: a */
    public static final Module f898a = ModuleKt.module$default(false, false, C0909a.f899a, 3, (Object) null);

    /* renamed from: c.a.c.n$a */
    public static final class C0909a extends Lambda implements Function1<Module, Unit> {

        /* renamed from: a */
        public static final C0909a f899a = new C0909a();

        public C0909a() {
            super(1);
        }

        public Object invoke(Object obj) {
            Module module = (Module) obj;
            Intrinsics.checkNotNullParameter(module, "$receiver");
            C0899e eVar = C0899e.f889a;
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(C0962a.class));
            beanDefinition.setDefinition(eVar);
            beanDefinition.setKind(kind);
            module.declareDefinition(beanDefinition, new Options(false, false, 1, (DefaultConstructorMarker) null));
            C0900f fVar = C0900f.f890a;
            Kind kind2 = Kind.Factory;
            BeanDefinition beanDefinition2 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(C0840a.class));
            beanDefinition2.setDefinition(fVar);
            beanDefinition2.setKind(kind2);
            module.declareDefinition(beanDefinition2, new Options(false, false, 1, (DefaultConstructorMarker) null));
            C0901g gVar = C0901g.f891a;
            Kind kind3 = Kind.Factory;
            BeanDefinition beanDefinition3 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(C0972a.class));
            beanDefinition3.setDefinition(gVar);
            beanDefinition3.setKind(kind3);
            module.declareDefinition(beanDefinition3, new Options(false, false, 1, (DefaultConstructorMarker) null));
            C0902h hVar = C0902h.f892a;
            Kind kind4 = Kind.Factory;
            BeanDefinition beanDefinition4 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(C0980a.class));
            beanDefinition4.setDefinition(hVar);
            beanDefinition4.setKind(kind4);
            module.declareDefinition(beanDefinition4, new Options(false, false, 1, (DefaultConstructorMarker) null));
            C0903i iVar = C0903i.f893a;
            Kind kind5 = Kind.Factory;
            BeanDefinition beanDefinition5 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(C0959a.class));
            beanDefinition5.setDefinition(iVar);
            beanDefinition5.setKind(kind5);
            module.declareDefinition(beanDefinition5, new Options(false, false, 1, (DefaultConstructorMarker) null));
            C0904j jVar = C0904j.f894a;
            Kind kind6 = Kind.Single;
            BeanDefinition beanDefinition6 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(TimeKeyWebService.class));
            beanDefinition6.setDefinition(jVar);
            beanDefinition6.setKind(kind6);
            module.declareDefinition(beanDefinition6, new Options(false, false));
            C0905k kVar = C0905k.f895a;
            Kind kind7 = Kind.Single;
            BeanDefinition beanDefinition7 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(SimpleKeyWebService.class));
            beanDefinition7.setDefinition(kVar);
            beanDefinition7.setKind(kind7);
            module.declareDefinition(beanDefinition7, new Options(false, false));
            C0906l lVar = C0906l.f896a;
            Kind kind8 = Kind.Factory;
            BeanDefinition beanDefinition8 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(C0946a.class));
            beanDefinition8.setDefinition(lVar);
            beanDefinition8.setKind(kind8);
            module.declareDefinition(beanDefinition8, new Options(false, false, 1, (DefaultConstructorMarker) null));
            C0907m mVar = C0907m.f897a;
            Kind kind9 = Kind.Factory;
            BeanDefinition beanDefinition9 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(C0950a.class));
            beanDefinition9.setDefinition(mVar);
            beanDefinition9.setKind(kind9);
            module.declareDefinition(beanDefinition9, new Options(false, false, 1, (DefaultConstructorMarker) null));
            C0895a aVar = C0895a.f885a;
            Kind kind10 = Kind.Factory;
            BeanDefinition beanDefinition10 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(C0933e.class));
            beanDefinition10.setDefinition(aVar);
            beanDefinition10.setKind(kind10);
            module.declareDefinition(beanDefinition10, new Options(false, false, 1, (DefaultConstructorMarker) null));
            C0896b bVar = C0896b.f886a;
            Kind kind11 = Kind.Factory;
            BeanDefinition beanDefinition11 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(C0978c.class));
            beanDefinition11.setDefinition(bVar);
            beanDefinition11.setKind(kind11);
            module.declareDefinition(beanDefinition11, new Options(false, false, 1, (DefaultConstructorMarker) null));
            C0897c cVar = C0897c.f887a;
            Kind kind12 = Kind.Factory;
            BeanDefinition beanDefinition12 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(C0984b.class));
            beanDefinition12.setDefinition(cVar);
            beanDefinition12.setKind(kind12);
            module.declareDefinition(beanDefinition12, new Options(false, false, 1, (DefaultConstructorMarker) null));
            C0898d dVar = C0898d.f888a;
            Kind kind13 = Kind.Factory;
            BeanDefinition beanDefinition13 = new BeanDefinition((Qualifier) null, (Qualifier) null, Reflection.getOrCreateKotlinClass(C0846a.class));
            beanDefinition13.setDefinition(dVar);
            beanDefinition13.setKind(kind13);
            module.declareDefinition(beanDefinition13, new Options(false, false, 1, (DefaultConstructorMarker) null));
            return Unit.INSTANCE;
        }
    }
}
