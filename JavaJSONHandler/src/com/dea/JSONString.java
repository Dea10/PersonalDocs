package com.dea;

public class JSONString {
    public static String jsonStr = "[\n" +
            "    {\n" +
            "        \"form\": {\n" +
            "            \"field\": [\n" +
            "                {\n" +
            "                    \"name\": \"certificated_driver\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Conductor certificado\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"shipment\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"#Referencia\",\n" +
            "                    \"visible\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"trailer_status\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Estado Remolque\",\n" +
            "                    \"visible\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"trailer_plate\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Placa Remolque\",\n" +
            "                    \"visible\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"appt_edit_button\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Modificar Cita\",\n" +
            "                    \"visible\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"seal1\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Sello 1\",\n" +
            "                    \"visible\": true\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        \"order\": 0,\n" +
            "        \"checklist\": null,\n" +
            "        \"feature_id\": 189,\n" +
            "        \"feature_key\": \"EXIT\",\n" +
            "        \"isauthorized\": true,\n" +
            "        \"resource_name\": \"Salida\",\n" +
            "        \"journey_travel\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"form\": {\n" +
            "            \"field\": [\n" +
            "                {\n" +
            "                    \"name\": \"certificated_driver\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Conductor certificado\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"trailer_plate\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Placa Remolque\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"truck_plate\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Placa Tractor\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"phone_number\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Telefono\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"shipment\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"#Referencia\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        \"order\": 0,\n" +
            "        \"checklist\": null,\n" +
            "        \"feature_id\": 190,\n" +
            "        \"feature_key\": \"DOCUMENT\",\n" +
            "        \"isauthorized\": true,\n" +
            "        \"resource_name\": \"Documentos\",\n" +
            "        \"journey_travel\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"form\": {\n" +
            "            \"field\": [\n" +
            "                {\n" +
            "                    \"name\": \"trailer_plate\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Placa Remolque\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"certificated_driver\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Conductor certificado\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"shipment\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"#Referencia\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"seal1\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Sello 1\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"seal2\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Sello 2\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"confirmation\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Confirmacion\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"phone_number\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Telefono\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"uncertificated_driver\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Conductor no certificado\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        \"order\": 0,\n" +
            "        \"checklist\": null,\n" +
            "        \"feature_id\": 191,\n" +
            "        \"feature_key\": \"START_LOAD\",\n" +
            "        \"isauthorized\": true,\n" +
            "        \"resource_name\": \"Inicio de carga\",\n" +
            "        \"journey_travel\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"form\": {\n" +
            "            \"field\": [\n" +
            "                {\n" +
            "                    \"name\": \"shipment\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"#Viaje\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"certificated_driver\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Conductor certificado\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"uncertificated_driver\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Conductor no certificado\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"trailer_plate\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Placa Remolque\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"confirmation\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Confirmacion\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"phone_number\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Telefono\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"seal1\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Sello 1\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"seal2\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Sello 2\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        \"order\": 0,\n" +
            "        \"checklist\": null,\n" +
            "        \"feature_id\": 193,\n" +
            "        \"feature_key\": \"END_LOAD\",\n" +
            "        \"isauthorized\": true,\n" +
            "        \"resource_name\": \"Fin de carga\",\n" +
            "        \"journey_travel\": [\n" +
            "            {\n" +
            "                \"data\": \"shipment\",\n" +
            "                \"name\": \"shipment\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Shipment\",\n" +
            "                \"targets\": 0\n" +
            "            },\n" +
            "            {\n" +
            "                \"data\": \"src_location_name\",\n" +
            "                \"name\": \"src_location_name\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Localidad Origen\",\n" +
            "                \"targets\": 0\n" +
            "            },\n" +
            "            {\n" +
            "                \"data\": \"driver_name\",\n" +
            "                \"name\": \"driver_name\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Conductor\",\n" +
            "                \"targets\": 0\n" +
            "            },\n" +
            "            {\n" +
            "                \"data\": \"src_app_transline_name\",\n" +
            "                \"name\": \"src_app_transline_name\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Linea de transporte planeada\",\n" +
            "                \"targets\": 0\n" +
            "            },\n" +
            "            {\n" +
            "                \"data\": \"_confirm_btn_form\",\n" +
            "                \"name\": \"_confirm_btn_form\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Confirmar\",\n" +
            "                \"targets\": 0\n" +
            "            }\n" +
            "        ]\n" +
            "    },\n" +
            "    {\n" +
            "        \"form\": {\n" +
            "            \"field\": [\n" +
            "                {\n" +
            "                    \"name\": \"trailer_plate\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Placa Remolque\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"shipment\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"#Referencia\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"certificated_driver\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Conductor certificado\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"trailer_eco\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Eco Remolque\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"truck_plate\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Placa Tractor\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"phone_number\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Telefono\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"seal1\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Sello 1\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"seal2\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Sello 2\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"uncertificated_driver\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Conductor no certificado\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"confirmation\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Confirmacion\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"readOnly\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"appt_edit_button\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Modificar Cita\",\n" +
            "                    \"visible\": true\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        \"order\": 0,\n" +
            "        \"checklist\": null,\n" +
            "        \"feature_id\": 128,\n" +
            "        \"feature_key\": \"ENTRANCE\",\n" +
            "        \"isauthorized\": true,\n" +
            "        \"resource_name\": \"Entrada\",\n" +
            "        \"journey_travel\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"form\": {\n" +
            "            \"field\": [\n" +
            "                {\n" +
            "                    \"name\": \"shipment\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"RFC\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"uncertificated_driver\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Conductor no certificado\",\n" +
            "                    \"visible\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"guard_name\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Apellido\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"confirmation\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Empresa\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"required\": true\n" +
            "                },\n" +
            "                {\n" +
            "                    \"name\": \"note\",\n" +
            "                    \"type\": \"TEXT\",\n" +
            "                    \"label\": \"Nombre\",\n" +
            "                    \"visible\": true,\n" +
            "                    \"required\": true\n" +
            "                }\n" +
            "            ]\n" +
            "        },\n" +
            "        \"order\": 0,\n" +
            "        \"checklist\": null,\n" +
            "        \"feature_id\": 152,\n" +
            "        \"feature_key\": \"GENERIC_01\",\n" +
            "        \"isauthorized\": false,\n" +
            "        \"resource_name\": \"Genérico 1\",\n" +
            "        \"journey_travel\": null\n" +
            "    },\n" +
            "    {\n" +
            "        \"form\": null,\n" +
            "        \"order\": 0,\n" +
            "        \"checklist\": null,\n" +
            "        \"feature_id\": 153,\n" +
            "        \"feature_key\": \"GENERIC_02\",\n" +
            "        \"isauthorized\": false,\n" +
            "        \"resource_name\": \"Genérico 2\",\n" +
            "        \"journey_travel\": [\n" +
            "            {\n" +
            "                \"data\": \"shipment\",\n" +
            "                \"name\": \"shipment\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Shipment\",\n" +
            "                \"targets\": 0\n" +
            "            },\n" +
            "            {\n" +
            "                \"data\": \"src_location_name\",\n" +
            "                \"name\": \"src_location_name\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Localidad Origen\",\n" +
            "                \"targets\": 1\n" +
            "            },\n" +
            "            {\n" +
            "                \"data\": \"vehicle_plate\",\n" +
            "                \"name\": \"vehicle_plate\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Placa tracto\",\n" +
            "                \"targets\": 2\n" +
            "            },\n" +
            "            {\n" +
            "                \"data\": \"trailer_plate\",\n" +
            "                \"name\": \"trailer_plate\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Placa remolque\",\n" +
            "                \"targets\": 3\n" +
            "            },\n" +
            "            {\n" +
            "                \"data\": \"srcr_generic01\",\n" +
            "                \"name\": \"srcr_generic01\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Registro genérico 1 origen\",\n" +
            "                \"targets\": 4\n" +
            "            },\n" +
            "            {\n" +
            "                \"data\": \"_confirm_btn\",\n" +
            "                \"name\": \"_confirm_btn\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Confirmar (sin formulario)\",\n" +
            "                \"targets\": 5\n" +
            "            },\n" +
            "            {\n" +
            "                \"data\": \"driver_name\",\n" +
            "                \"name\": \"driver_name\",\n" +
            "                \"spIdx\": 0,\n" +
            "                \"title\": \"Conductor\",\n" +
            "                \"targets\": 0\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "]";
}
