SUMMARY = "Simple rfdc-intr application"

require rfdc-examples.inc

do_compile() {
    make all BOARD_FLAG=${FLAG} OUTS=rfdc-intr RFDC_OBJS=xrfdc_intr_example.o
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/rfdc-intr ${D}${bindir}
}

